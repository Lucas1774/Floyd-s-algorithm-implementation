import java.util.ArrayList;

public class Solution{
    static final int INFINITE = Integer.MAX_VALUE/2;
    ArrayList <CoupleSolution> listofcouples;
    int size;
    public Solution(){
        this.listofcouples = new ArrayList <CoupleSolution>();
        this.size = 0;
    }
    public class CoupleSolution{
        private int origin;
        private int destination;
        private ArrayList <Integer> nodesofpath;
        private int distance;
        public CoupleSolution(int origin, int destination,ArrayList <Integer> nodesofpath, int distance){
            this.origin = origin;
            this.destination = destination;
            this.nodesofpath = nodesofpath;
            this.distance = distance;
        }
        
        public int getOrigin(){
            return this.origin;
        }
        
        public int getDestination(){
            return this.destination;
        }
        
        public ArrayList <Integer> getNodesofPath(){
            return this.nodesofpath;
        }
        
        public int getDistance(){
            return this.distance;
        }
        
    }
    public CoupleSolution get(int i){
        return this.listofcouples.get(i);
    }
    
    public void add (int origin, int destination,ArrayList <Integer> nodesofpath, int distance){
        CoupleSolution s = new CoupleSolution (origin, destination, nodesofpath, distance);
        this.listofcouples.add(s);
        this.size++;
    }
}
