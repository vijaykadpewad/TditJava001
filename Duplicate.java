package Arraypack;

public class Duplicate {


        public static void main(String[] args) {
            String input = "java gh gh java hjgf java";
            String[] words = input.split("\\W+");
            boolean[] visited = new boolean[words.length];

            System.out.println("Repeated words:");
            for (int i = 0; i < words.length; i++) {
                if (!visited[i]) {
                    boolean isRepeated = false;
                    for (int j = i + 1; j < words.length; j++) {
                        if (words[i].equals(words[j])) {
                            isRepeated = true;
                            visited[j] = true;
                        }
                    }
                    if (isRepeated) {
                        System.out.println(words[i]);
                    }
                }
            }
        }
    }

