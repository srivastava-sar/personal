package Graph;

import java.util.*;
public class UndirectedNoWtGraph {
	
	int V;
	LinkedList<Integer>[] adj; 
	
	UndirectedNoWtGraph(int item){
		this.V =item;
		adj = new LinkedList[V];
		for(int i=0;i<V;i++)
			adj[i] = new LinkedList();
	}
	
	public void addEdge(int vert, int addVert){
		adj[vert].add(addVert);
	}
	
	public void ShortestPath1(int s){
		Queue<Integer> queue = new LinkedList();
		int[] Path = new int[V];
		int[] distance = new int[V];
		for(int i=0;i<V;i++)
			distance[i] = -1;
		distance[s] = 0;
		queue.add(s);
		while(!queue.isEmpty()){
			int buff = queue.poll();
			Iterator<Integer> i = adj[buff].listIterator();
			while(i.hasNext()){
				int n = i.next();
				if(distance[n] != -1){
					Path[n] = buff;
					distance[n] = distance[V]+1;
					queue.add(n);
				}
			}
		}
		queue.clear();
		for(int i=0;i<V;i++)
			System.out.println(Path[i]);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UndirectedNoWtGraph g = new UndirectedNoWtGraph(4);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.ShortestPath1(2);
	}

}
