// Date : 28th Nove 2023
//https://leetcode.com/problems/last-stone-weight/
class Solution {
    public int lastStoneWeight(int[] stones) {
        // max priority queue
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    for(int element : stones){  //adding the elements 
        pq.add(element);
    }
    while(pq.size()>1){
        int max = pq.remove();
        int secondMax = pq.remove();

        int nStone = max -secondMax ;
if(nStone!=0){
    pq.add(nStone);
         }

    }
    if(pq.size()==0){
        return 0;
    }else{
        return pq.remove();
    }
        
    }
}
