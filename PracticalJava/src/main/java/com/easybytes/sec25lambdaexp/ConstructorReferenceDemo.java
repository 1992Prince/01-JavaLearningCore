package com.easybytes.sec25lambdaexp;

public class ConstructorReferenceDemo {

    public static void main(String[] args) {

        // Creating object of Product class via normal lambda expression
        ProductInterface productInterface = (name, price) -> new Product(name, price);
        Product kitkatProduct = productInterface.getProduct("Kitkat", 11.00);
        System.out.println(kitkatProduct); // Product{name='Kitkat', price=11.0}

        System.out.println();

        // Creating object of Product class via Constructor Method Reference
        ProductInterface constructorRef = Product::new;
        Product MacProduct = constructorRef.getProduct("Mac", 111232.00);
        System.out.println(MacProduct); // Product{name='Mac', price=111232.0}


    }
}
