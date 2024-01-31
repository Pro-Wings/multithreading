package com.prowings.interthreadcommunication;

class Consumer implements Runnable {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            int consumedItem = sharedResource.consume();
            // Process the consumed item if needed
            try {
                Thread.sleep(1500); // Simulate some consumption time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}