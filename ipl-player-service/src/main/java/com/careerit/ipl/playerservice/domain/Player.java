package com.careerit.ipl.playerservice.domain;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

		@Id
		private String id;
		private String name;
		private double amount;
		private String role;
		private String label;
}
