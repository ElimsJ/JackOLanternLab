public class JackOLanternRunner{
    public static void main(String[] args)
    {
        String[][] JackOLantern= new String[0][1];
        JackOLantern face = new JackOLantern(JackOLantern);
        face.fill("XXXX");
        JackOLantern[0][2] = "";
        JackOLantern[2][3] = "";
        JackOLantern[3][4] = "";
        JackOLantern[4][5] = "";
        String str = face.toString();
        System.out.println(str);

    }
}
