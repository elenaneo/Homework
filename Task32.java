public class Task6 {
        public static void main(String[] args) {
            System.out.println(union_str("abgsgdc","ckkelswa"));
        }

        public static String union_str(String str1, String str2) {
            String rez_str = new String ();
            for (char s: (str1+str2).toCharArray()) {
                if (rez_str.indexOf(s) == -1) {
                    rez_str += s;
                }
            }
            return rez_str;
        }

    }

   
   
