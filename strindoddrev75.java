String s,s3;
        String[] s1=new String[40];
        int i,j=1;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        String[] a=s.split("\\s");
        int n=a.length;
        for(i=0;i<n;i++){
            s1[j]=a[i];
            if(j%2!=0){
                s3=new StringBuffer(s1[j]).reverse().toString();
                s1[j]=s3;
            }
            j++;
        }for(i=1;i<j;i++){
            System.out.print(""+s1[i]+" ");
        }