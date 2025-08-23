import java.util.*;
class BFS{
    public static void  main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int v= 6;

        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(2).add(5);
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(4).add(3);
        adj.get(4).add(5);
        adj.get(5).add(2);
        adj.get(5).add(4);
         

        ArrayList<Integer> result=new ArrayList<>();
        result=bfs(adj);
        for(int i=0;i<result.size();i++)
        {
            System.out.print(result.get(i)+" ");
        }
        
    }
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n=adj.size();
        boolean visitedArray[] = new boolean[n];
        ArrayList<Integer> result = new ArrayList<>();
        
        Queue<Integer> queue =new LinkedList<>();
        queue.offer(0);
        visitedArray[0]=true;
        
        while(!queue.isEmpty())
        {
            int value = queue.poll();
            
            result.add(value);
            
            for(Integer i: adj.get(value))
            {
                if(visitedArray[i]==false)
                {
                    visitedArray[i]=true;
                    queue.add(i);
                }
            }
        }
        
        return result;
    }
}