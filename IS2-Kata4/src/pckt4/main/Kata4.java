package pckt4.main;

import java.io.IOException;
import java.util.List;
import pckt4.model.Histogram;
import pckt4.model.Mail;
import pckt4.view.HistogramDisplay;
import pckt4.view.MailHistogramBuilder;
import pckt4.view.MailListReader;

public class Kata4 {
    
    public String filename;
    public List<Mail> mailList;
    Histogram<String> histogram;
    HistogramDisplay histoDisplay;
     
     public static void main(String[] args) throws IOException, Exception {
         Kata4 kata4 = new Kata4();
         kata4.execute();
    }
     
    public void execute() throws IOException {
            input();
            process();
            output();
        }

    public void input() throws IOException {
        filename = "C:\\Users\\INV\\Desktop\\Kata4\\emails.txt";
        mailList = MailListReader.read(filename);
    }

    public void process() throws IOException {
        histogram = MailHistogramBuilder.build(mailList);
        
    }

    public void output() {
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
