package TugasPemlan2;

import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {
        Library perpus = new Library("Judul Default", "Penulis Default", 0, "Sinopsis Default");

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.printf("=======[Perpustakaan]=======\n"
                + "Masukkan pilihan untuk melihat buku berdasarkan kategori\n"
                + "1. Teknologi\n" + "2. Filsafat\n" + "3. Sejarah\n" + "4. Agama\n"
                + "5. Psikologi\n" + "6. Politik\n" + "7. Fiksi\n"
                + "8. Keluar dari program\n");
            System.out.println("Silahkan memasukkan kode yang diinginkan(1-8)");
            int kode = scan.nextInt();
            
            if (kode == 1) {
                Library[] teknologi = {
                    new Library("The Age of Surveillance Capitalism: The Fight for a Human Future at the New Frontier of Power", "Shoshana Zuboff", 704, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 464, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution", "Walter Isaacson", 560, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("Weapons of Math Destruction: How Big Data Increases Inequality and Threatens Democracy", "Cathy O'Neil", 272, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("AI Superpowers: China, Silicon Valley, and the New World Order", "Kai-Fu Lee", 272, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?")
                };
                perpus.kategori(teknologi);
            } else if (kode == 2) {
                Library[] filsafat = {
                    new Library("The Philosophy Book: Big Ideas Simply Explained", "DK", 352, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("Justice: What's the Right Thing to Do?", "Michael J. Sandel", 320, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("The Big Questions: A Short Introduction to Philosophy", "Robert C. Solomon, Kathleen M. Higgins", 336, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("Thinking, Fast and Slow", "Daniel Kahneman", 512, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("The Consolations of Philosophy", "Alain de Botton", 272, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?")
                };
                perpus.kategori(filsafat);
            } else if (kode == 3) {
                Library[] sejarah = {
                    new Library("A People's History of the United States", "Howard Zinn", 784, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("Guns, Germs, and Steel: The Fates of Human Societies", "Jared Diamond", 480, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 464, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("The Rise and Fall of the Third Reich: A History of Nazi Germany", "William L. Shirer", 1280, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("The Silk Roads: A New History of the World", "Peter Frankopan", 672, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?")
                };
                perpus.kategori(sejarah);
            } else if (kode == 4) {
                Library[] agama = {
                    new Library("The God Delusion", "Richard Dawkins", 464, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("Zealot: The Life and Times of Jesus of Nazareth", "Reza Aslan", 336, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("The Case for Christ: A Journalist's Personal Investigation of the Evidence for Jesus", "Lee Strobel", 336, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("Waking Up: A Guide to Spirituality Without Religion", "Sam Harris", 256, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("Why Religion?: A Personal Story", "Elaine Pagels", 256, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?")
                };
                perpus.kategori(agama);
            } else if (kode == 5) {
                Library[] psikologi = {
                    new Library("Thinking, Fast and Slow", "Daniel Kahneman", 512, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("The Power of Habit: Why We Do What We Do in Life and Business", "Charles Duhigg", 400, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", 352, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("Blink: The Power of Thinking Without Thinking", "Malcolm Gladwell", 296, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("Emotional Intelligence: Why It Can Matter More Than IQ", "Daniel Goleman", 384, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?")
                };
                perpus.kategori(psikologi);
            } else if (kode == 6) {
                Library[] politik = {
                    new Library("The Righteous Mind: Why Good People are Divided by Politics and Religion", "Jonathan Haidt", 512, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("The End of History and the Last Man", "Francis Fukuyama", 464, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("The New Jim Crow: Mass Incarceration in the Age of Colorblindness", "Michelle Alexander", 352, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("How Democracies Die", "Steven Levitsky, Daniel Ziblatt", 320, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("On Tyranny: Twenty Lessons from the Twentieth Century", "Timothy Snyder", 128, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?")
                };
                perpus.kategori(politik);
            } else if (kode == 7) {
                Library[] fiksi = {
                    new Library("The Night Circus", "Erin Morgenstern", 400, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("The Goldfinch", "Donna Tartt", 771, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("Circe", "Madeline Miller", 400, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("The Underground Railroad", "Colson Whitehead", 336, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                    new Library("Normal People", "Sally Rooney", 288, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?")
                };
                perpus.kategori(fiksi);
            } else if (kode == 8) {
                break;
            } else {
                System.out.println("Mohon maaf, kode yang Anda masukkan tidak valid.");
            }
        }

        scan.close();
    }
}


