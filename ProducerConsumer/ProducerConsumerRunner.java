package com.produce.consumer;

public class ProducerConsumerRunner {

	public static void main(String[] args) {

		ProducerConsumer a=new ProducerConsumer();
		Producer p=new Producer(a);
		Consumer c=new Consumer(a);
		p.start();
		c.start();
		
		

	}

}
