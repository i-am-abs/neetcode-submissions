class MedianFinder {
    PriorityQueue<Integer>leftMaxHeap;
    PriorityQueue<Integer>rightMinHeap;
    public MedianFinder() {
        leftMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        rightMinHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(leftMaxHeap.isEmpty() || leftMaxHeap.peek() > num) {
            leftMaxHeap.add(num);
        } else {
            rightMinHeap.add(num);
        }

        if(Math.abs(rightMinHeap.size() - leftMaxHeap.size()) > 1) {
            rightMinHeap.add(leftMaxHeap.poll());
        } else if(rightMinHeap.size() > leftMaxHeap.size()) {
            leftMaxHeap.add(rightMinHeap.poll());
        }
    }
    
    public double findMedian() {
        if(leftMaxHeap.size() == rightMinHeap.size()) {
            return (leftMaxHeap.peek() + rightMinHeap.peek())/2.0;
        }
        return leftMaxHeap.peek();
    }
}
