package com.produce.consumer;

public class ProducerConsumer {

	boolean flag = true;
	int count = 0;

	public synchronized void produce() {
		try {
			while (true) {
				if (flag == true) {
					count = count + 1;
					System.out.println("Producer Produced Item" + count);
					flag = false;
					notify();
					wait();
				} else {
					wait();

					/*
					 * try { Thread.sleep(2000); } catch (InterruptedException e) {
					 * e.printStackTrace(); }
					 */
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void consume() {
		try {
			while (true) {
				if (flag == true) {
					wait();
				} else {
					System.out.println("Consumer Consumed Item" + count);
					flag = true;

					notify();
					wait();

					/*
					 * try { Thread.sleep(2000); } catch (InterruptedException e) {
					 * e.printStackTrace(); }
					 */
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
