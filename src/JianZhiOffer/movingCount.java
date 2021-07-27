package JianZhiOffer;

public class movingCount {
    public static void main(String[] args){
        int m,n,k;
        System.out.println(movingCount(3,2,17));
    }

    static int count=0;
    public static int movingCount(int m, int n, int k) {
        int row=m,column=n;
        boolean[][] visited = new boolean[m][n];
        move(visited,m,n,0,0,k);
        return count;
    }

    public static void move(boolean[][] visited,int m,int n,int x,int y,int k){
        if(x<0 || x>=m || y>=n || y<0 || visited[x][y]){
            return;
        }
        int countRow=0,countColumn=0;
        int row = x,column = y;
        while(row!=0){
            countRow+=(row%10);
            row/=10;
        }
        while(column!=0){
            countColumn+=(column%10);
            column/=10;
        }
        int total = countRow+countColumn;
        if(total>k){
            return ;
        }
        visited[x][y]=true;
        count++;
        move(visited,m,n,x+1,y,k);
        move(visited,m,n,x,y+1,k);
    }
}
