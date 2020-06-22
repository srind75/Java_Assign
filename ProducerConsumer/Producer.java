package com.produce.consumer;

public class Producer extends Thread {
	ProducerConsumer a;

	Producer(ProducerConsumer a) {
		this.a = a;
	}

	public void run() {
		a.produce();		
	}
}
