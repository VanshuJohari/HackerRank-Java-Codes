

    static boolean isAnagram(String a, String b) {
        // Complete the function
       // int l1=a.length();
        //int l2=b.length();
        if(a.length()!=b.length())
        return false;
        int a1[]=new int[26];
        int a2[]=new int[26];
        a=a.toLowerCase();
        b=b.toLowerCase();
            for(int i=0;i<a.length();i++)
            {
                    a1[a.charAt(i)-'a']++;
                    a2[b.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++)
            {
                if(a1[i]!=a2[i])
                return false;
            }
            return true;
}

