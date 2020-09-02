import java.io.*;


class Program3 {

        public static void main(String[] args) throws IOException {

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.print("Enter Distance (in meter): ");
                int dist = Integer.parseInt(br.readLine());
                System.out.print("Enter Time (in sec): ");
                int time = Integer.parseInt(br.readLine());

		int speed = dist / time;

		System.out.println("Velocity of particle = "+speed+" m/s");
        }
}

