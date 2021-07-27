package JianZhiOffer;

public class exist {
    public static void main(String[] args){
        String word="ABCCED";
        char[][] board = {{'A','B','C','E'}, {'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist(board,word));
    }

    public static boolean exist(char[][] board, String word) {
        int row=board.length;
        if(row==0){
            return false;
        }
        int column=board[0].length;
        if(column==0){
            return false;
        }
        if(word.length()==0){
            return false;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean[][] visited = new boolean[row][column];
                    int mark=0;
                    boolean res = dfs(i,j,board,visited,word,mark);
                    if(res==true){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean dfs(int x,int y,char[][] board,boolean[][] visited,String word,int mark){
        if(mark==word.length()){
            return true;
        }
        int row=board.length;
        int column=board[0].length;
        boolean flag = false;
        if(0<=x&& x<row && 0<=y && y< column && board[x][y]==word.charAt(mark) && !visited[x][y]){
            visited[x][y]=true;
            flag = dfs(x+1,y,board,visited,word,mark+1) || dfs(x-1,y,board,visited,word,mark+1) || dfs(x,y+1,board,visited,word,mark+1) || dfs(x,y-1,board,visited,word,mark+1);
            if(!flag){
                visited[x][y]=false;
            }
        }
        return flag;
    }
}
