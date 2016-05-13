/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assaultonpa13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Show {
  private String title;
  private String tagline;
  private String host;
  private ArrayList<Outcome> Results;
  private String fileName;

  public Show() {
  }

  public Show(String inTitle, String inTag, String inHost) {
    title = inTitle;
    tagline = inTag;
    host = inHost;
    Results = new ArrayList<Outcome>();
  }

  public void setResults(ArrayList<Outcome> inResults) {
    Results = inResults;
  }

  public Outcome getResult(int i) {
    int resNum = i % 3;
    return Results.get(resNum);
  }

  public void readOutcomes(String fileName) throws FileNotFoundException, IOException {
    String line;
    int i = 0; // counter to tell me which field to fill with each line
    BufferedReader LineIn = new BufferedReader(new FileReader(fileName));
    line = LineIn.readLine();
    while (line != null) {
      switch (i % 3) {

      case 0:
        Results.add(new Outcome());
        Results.get(Results.size() - 1).setAnger(Integer.parseInt(line));
      case 1:
        Results.get(Results.size() - 1).setIncome(Integer.parseInt(line));
      default:
        Results.get(Results.size() - 1).setDescription(line);
      }
      line = LineIn.readLine();
      i++;
    }
    LineIn.close();
  }

  /**
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @param title
   *          the title to set
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * @return the tagline
   */
  public String getTagline() {
    return tagline;
  }

  /**
   * @param tagline
   *          the tagline to set
   */
  public void setTagline(String tagline) {
    this.tagline = tagline;
  }

  /**
   * @return the host
   */
  public String getHost() {
    return host;
  }

  /**
   * @param host
   *          the host to set
   */
  public void setHost(String host) {
    this.host = host;
  }

  /**
   * @return the fileName
   */
  public String getFileName() {
    return fileName;
  }

  /**
   * @param fileName
   *          the fileName to set
   */
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }
}
