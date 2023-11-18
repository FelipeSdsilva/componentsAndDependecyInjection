package com.felipesousa.aula;

import com.felipesousa.aula.entities.Order;
import com.felipesousa.aula.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(AulaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Integer code = scanner.nextInt();
        Double basic = scanner.nextDouble();
        Double discount = scanner.nextDouble();

        Order order = new Order(code, basic, discount);

        System.out.println("Pedido código: " + order.getCode() +
                "\nValor Total: R$ "+ String.format("%.2f", orderService.total(order)));

        scanner.close();
    }
}
