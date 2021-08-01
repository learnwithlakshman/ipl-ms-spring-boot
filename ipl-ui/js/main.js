const url = "http://localhost:8085/teamstat/api/all";

const idTeamsData = document.querySelector("#idTeamsData");

fetch(url).then(res=>res.json()).then(data=>{
       let str = `<table class="table">
       <thead>
         <tr>
         
           <th scope="col">Name</th>
           <th scope="col">Coach</th>
           <th scope="col">Total Player</th>
           <th scope="col">Total Amount</th>
         </tr>
       </thead>`;
       str += `<tbody>`

        for(i = 0;i<data.length;i++){
           let team = data[i];
            str += `<tr>
                    <td>${team['teamName']}</td>
                    <td>${team['coachName']}</td>
                    <td>${team['playerCount']}</td>
                    <td>${team['totalAmount']}</td>
                    </tr>`;
        }
       str += `</tbody>`
          str += `</table>`
          idTeamsData.innerHTML = str;
})

// Configuration
// Hystrix 
// Logging 