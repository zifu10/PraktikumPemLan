package TugasPemLan1;

public class Library {
    public String[][] Teknologi = {
        {"The Age of Surveillance Capitalism: The Fight for a Human Future at the New Frontier of Power", "Shoshana Zuboff", "704", "PublicAffairs", "2019"},
        {"Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "464", "Harper", "2014"},
        {"The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution", "Walter Isaacson", "560","Simon & Schuster", "2014"},
        {"Weapons of Math Destruction: How Big Data Increases Inequality and Threatens Democracy", "Cathy O'Neil", "272", "Crown", "2016"},
        {"AI Superpowers: China, Silicon Valley, and the New World Order", "Kai-Fu Lee", "272", "Houghton Mifflin Harcourt", "2018"}
    };

    public String[][] Filsafat = {
        {"The Philosophy Book: Big Ideas Simply Explained", "DK", "352", "DK","2011"},
        {"Justice: What's the Right Thing to Do?", "Michael J. Sandel", "320", "Farrar, Straus and Giroux", "2009"},
        {"The Big Questions: A Short Introduction to Philosophy", "Robert C. Solomon, Kathleen M. Higgins", "336", "Cengage Learning", "2008"},
        {"Thinking, Fast and Slow", "Daniel Kahneman", "512", "Farrar, Straus and Giroux", "2011"},
        {"The Consolations of Philosophy", "Alain de Botton", "272", "Penguin Books", "2000"}
    };

    public String[][] Sejarah = {
        {"A People's History of the United States", "Howard Zinn", "784", "Harper Perennial Modern Classics", "1980"},
        {"Guns, Germs, and Steel: The Fates of Human Societies", "Jared Diamond", "480 halaman", "W. W. Norton & Company", "1997"},
        {"Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "464", "Harper", "2014"},
        {"The Rise and Fall of the Third Reich: A History of Nazi Germany", "William L. Shirer", "1280 halaman", "Simon & Schuster", "1960"},
        {"The Silk Roads: A New History of the World", "Peter Frankopan", "672", "Bloomsbury Publishing", "2015"}
    };
    
    public String[][] Agama = {
        {"The God Delusion", "Richard Dawkins", "464", "Bantam Press", "2006"},
        {"Zealot: The Life and Times of Jesus of Nazareth", "Reza Aslan", "336", "Random House", "2013"},
        {"The Case for Christ: A Journalist's Personal Investigation of the Evidence for Jesus", "Lee Strobel", "336", "Zondervan", "1998"},
        {"Waking Up: A Guide to Spirituality Without Religion", "Sam Harris", "256", "Simon & Schuster", "2014"},
        {"Why Religion?: A Personal Story", "Elaine Pagels", "256", "Ecco", "2018"}
    };

    public String[][] Psikologi = {
        {"Thinking, Fast and Slow", "Daniel Kahneman", "512", "Farrar, Straus and Giroux", "2011"},
        {"The Power of Habit: Why We Do What We Do in Life and Business", "Charles Duhigg", "400", "Random House", "2012"},
        {"Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "352", "Crown Publishing Group", "2012"},
        {"Blink: The Power of Thinking Without Thinking", "Malcolm Gladwell", "296", "Little, Brown and Company", "2005"},
        {"Emotional Intelligence: Why It Can Matter More Than IQ", "Daniel Goleman", "384", "Bantam Books", "1995"}
    }; 

    public String[][] Politik = {
        {"The Righteous Mind: Why Good People are Divided by Politics and Religion", "Jonathan Haidt", "512", "Pantheon Books", "2012"},
        {"The End of History and the Last Man", "Francis Fukuyama", "464", "Free Press", "1992"},
        {"The New Jim Crow: Mass Incarceration in the Age of Colorblindness", "Michelle Alexander", "352", "The New Press", "2010"},
        {"How Democracies Die", "Steven Levitsky, Daniel Ziblatt", "320", "Crown Publishing Group", "2018"},
        {"On Tyranny: Twenty Lessons from the Twentieth Century", "Timothy Snyder", "128", "Tim Duggan Books", "2017"}
    }; 

    public String[][] Fiksi = {
        {"The Night Circus", "Erin Morgenstern", "400", "Doubleday", "2011"},
        {"The Goldfinch", "Donna Tartt", "771", "Little, Brown and Company", "2013"},
        {"Circe", "Madeline Miller", "400", "Little, Brown and Company", "2018"},
        {"The Underground Railroad", "Colson Whitehead", "336", "Doubleday", "2016"},
        {"Normal People", "Sally Rooney", "288", "Hogarth Press", "2018"}
    };
    
    public void showtype(String[][] type, String categoryType) {
        System.out.printf("Kategori %s\n\n", categoryType);
        for(int i = 0; i < type.length; i++) {
            System.out.printf("Buku ke-%d\n" 
            + "1. %-15s: %s\n" + "2. %-15s: %s\n" + "3. %-15s: %s halaman\n" 
            + "4. %-15s: %s\n" + "5. %-15s: %s\n\n", 
            i + 1, "Judul Buku", type[i][0], "Penulis", type[i][1], "Jumlah Halaman", type[i][2], 
            "Penerbit", type[i][3], "Tahun Terbit", type[i][4]);
        }
    }
}
