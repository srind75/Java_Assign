package com.produce.consumer;

public class Consumer extends Thread {
	ProducerConsumer a;

	Consumer(ProducerConsumer a) {
		this.a = a;
	}

	public void run() {
		a.consume();
	}
}