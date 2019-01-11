/*
 * Given n processes, each process has a unique PID (process id) and its PPID (parent process id).
 *
 * Each process only has one parent process, but may have one or more children processes. This is just like a tree structure. 
 * Only one process has PPID that is 0, which means this process has no parent process. All the PIDs will be distinct positive 
 * integers.
 * 
 * We use two list of integers to represent a list of processes, where the first list contains PID for each process and the 
 * second list contains the corresponding PPID.
 *
 * Now given the two lists, and a PID representing a process you want to kill, return a list of PIDs of processes that will 
 * be killed in the end. You should assume that when a process is killed, all its children processes will be killed. No order 
 * is required for the final answer.
 */

class Solution {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill)     {
        
        //HashMap holds the relation between parent and direct children
        HashMap<Integer,List<Integer>> parentChildMap = new HashMap<Integer,List<Integer>>();
        
        List<Integer> result = new ArrayList<Integer>();
        
        //Construct the mapping
        for(int i=0;i<ppid.size();i++){
            List<Integer> list = parentChildMap.getOrDefault(ppid.get(i), new ArrayList<Integer>());
            list.add(pid.get(i));
            parentChildMap.put(ppid.get(i),list);
        }
        
        killProcessRecursively(parentChildMap, kill,result);
        return result;
    }
    
    public void  killProcessRecursively(HashMap<Integer,List<Integer>> parentChildMap, int kill,List<Integer> result){
        
        result.add(kill);
        //Recursively add children to the list if the parent needs to be killed
        if(parentChildMap.containsKey(kill)){
            for(Integer item:parentChildMap.get(kill))
                killProcessRecursively(parentChildMap,item,result);
        }
    }
}
