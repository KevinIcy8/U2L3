public class Letter
{
    /** Prints out a complete letter by printing the greeting,
     Followed by the special message, followed by the closing */
    private String nameOfSender;
    private String nameToSend;
    public Letter(String fromName)
    {
        nameOfSender = fromName;
    }

    public void writeLetter(String toName)
    {
        nameToSend = toName;
        greeting();
        specialMessage();
        closing();
    }

    public void greeting()
    {
        System.out.println("Hello, " + nameToSend + "!");
    }

    public void specialMessage()
    {

        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing()
    {

        System.out.println("From, " + nameOfSender);
    }
}
