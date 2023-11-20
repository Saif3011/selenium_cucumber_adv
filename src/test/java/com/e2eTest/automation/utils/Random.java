package com.e2eTest.automation.utils;

import com.github.javafaker.Faker;

public class Random extends BasePage {

	public Random() {
		super(Setup.getDriver());

	}

	public static String RandomEmail() {
		Faker faker = new Faker();

		return faker.internet().emailAddress();
	}

	public static String RandomFirstName() {
		Faker faker = new Faker();

		return faker.name().firstName();
	}

	public static String RandomLastName() {
		Faker faker = new Faker();

		return faker.name().lastName();
	}

}
