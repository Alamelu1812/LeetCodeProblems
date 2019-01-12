/*
 * Write a class RecentCounter to count recent requests.
 *
 * It has only one method: ping(int t), where t represents some time in milliseconds.
 *
 * Return the number of pings that have been made from 3000 milliseconds ago until now.
 *
 * Any ping with time in [t - 3000, t] will count, including the current ping.
 *
 * It is guaranteed that every call to ping uses a strictly larger value of t than before.
 *
 */
 
class RecentCounter {

    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList();
    }
    
    public int ping(int t) {
        queue.add(t);
        if(!queue.isEmpty()){
            while(queue.peek() < t-3000)
                queue.poll();
        }
        return queue.size();
    }
}
