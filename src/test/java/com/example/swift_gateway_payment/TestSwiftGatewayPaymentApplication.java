package com.example.swift_gateway_payment;

import org.springframework.boot.SpringApplication;

public class TestSwiftGatewayPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.from(SwiftGatewayPaymentApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
