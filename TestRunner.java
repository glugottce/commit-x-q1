import java.io.*;

public class TestRunner {
    public static void main(String[] args) {
        String[] testCases = {
            "event_files/1input1.txt", "event_files/1output1.txt",
            "event_files/1input2.txt", "event_files/1output2.txt",
            "event_files/1input3.txt", "event_files/1output3.txt",
            "event_files/1input4.txt", "event_files/1output4.txt",
            "event_files/1input5.txt", "event_files/1output5.txt",
            "event_files/1input6.txt", "event_files/1output6.txt"
        };

        for (int i = 0; i < testCases.length; i += 2) {
            String inputFile = testCases[i];
            String expectedOutputFile = testCases[i + 1];

            try {
                ProcessBuilder pb = new ProcessBuilder("java", "-cp", ".", "Solution");
                pb.redirectInput(new File(inputFile));
                
                pb.redirectOutput(ProcessBuilder.Redirect.PIPE);
                
                Process process = pb.start();

                process.waitFor();

                BufferedReader outputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                BufferedReader expectedReader = new BufferedReader(new FileReader(expectedOutputFile));

                String actualOutput = outputReader.readLine();
                String expectedOutput = expectedReader.readLine();

                if (actualOutput == null) actualOutput = "";
                if (expectedOutput == null) expectedOutput = "";

                actualOutput = actualOutput.trim();
                expectedOutput = expectedOutput.trim();

                if (actualOutput.equals(expectedOutput)) {
                    System.out.println("✅ Passed " + inputFile);
                } else {
                    System.out.println("❌ Failed " + inputFile + ". Expected: \"" + expectedOutput + "\", Got: \"" + actualOutput + "\"");
                }

                outputReader.close();
                expectedReader.close();
            } catch (IOException | InterruptedException e) {
                System.out.println("Error running test case " + inputFile + ": " + e.getMessage());
            }
        }
    }
}
