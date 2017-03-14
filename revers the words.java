public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
       System.out.print("Enter the String:");
       s=sc.nextLine();
        int n=s.length();
       String[] s1= new String[n];
       s1=s.split(" ");
       System.out.print("revers string:" );
       for(int i=s1.length-1;i>=0;i--){
        System.out.print(""+s1[i]);
        if(i>0){
            System.out.print(" ");
        }
       }
    }