package com.careerit.ipl.teamservice.domain;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team {

		@Id
		private String id;
		private String name;
		private String coach;
		private String homeGround;
		private String label;
}
