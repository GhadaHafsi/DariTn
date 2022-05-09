package com.example.demo.controllers;

import com.example.demo.dto.PaymentDTO;
import com.example.demo.entities.Payment;
import com.example.demo.services.PaymentService;
import com.stripe.exception.StripeException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/payment")
@CrossOrigin(origins = "http://localhost:4200")

public class PaymentController {
    
    private PaymentService paymentService;


    public PaymentController(PaymentService paymentService){
        this.paymentService=paymentService;
    }

    @PostMapping("/create-new-payment")
    @ResponseBody
    public Payment createNewPayment(@RequestBody PaymentDTO paymentDTO) throws StripeException{
          return paymentService.savePayment(paymentDTO);
    }
}
