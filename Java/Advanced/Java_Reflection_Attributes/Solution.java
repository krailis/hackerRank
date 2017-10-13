// Author:      Konstantinos Railis
// Github:      github.com/krailis
// Hackerrank:  hackerrank.com/krailis

public class Solution {

    public static void main(String[] args){
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method s : methods) {
            methodList.add(s.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList) {
            System.out.println(name);
        }
    }
}

