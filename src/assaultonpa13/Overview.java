/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assaultonpa13;

public class Overview {
  private int health;
  private int healthMax;
  private int money;
  private int guards;
  private int protestors;
  private int quality;
  private int fixCost;
  private int impBarrCost;
  private int hireCost;
  private int appCost;
  private int impProgCost;
  private int day;
  private String flavorText;

  public Overview() {
    health = 100;
    healthMax = 100;
    money = 1000;
    protestors = 20;
    guards = 1;
    quality = 0;
    fixCost = 50;
    impBarrCost = 100;
    hireCost = 100;
    impProgCost = 500;
    appCost = 50;
    day = 0;
    flavorText = new String();
  }

  public boolean checkMoney(int expense) {
    if (expense <= money) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * @return the appCost
   */
  public int getAppCost() {
    return appCost;
  }

  /**
   * @param appCost
   *          the appCost to set
   */
  public void setAppCost(int appCost) {
    this.appCost = appCost;
  }

  /**
   * @return the day
   */
  public int getDay() {
    return day;
  }

  /**
   * @param day
   *          the day to set
   */
  public void setDay(int day) {
    this.day = day;
  }

  /**
   * @return the fixCost
   */
  public int getFixCost() {
    return fixCost;
  }

  /**
   * @param fixCost
   *          the fixCost to set
   */
  public void setFixCost(int fixCost) {
    this.fixCost = fixCost;
  }

  /**
   * @return the flavorText
   */
  public String getFlavorText() {
    return flavorText;
  }

  /**
   * @param flavorText
   *          the flavorText to set
   */
  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

  /**
   * @return the guards
   */
  public int getGuards() {
    return guards;
  }

  /**
   * @param guards
   *          the guards to set
   */
  public void setGuards(int guards) {
    this.guards = guards;
  }

  /**
   * @return the health
   */
  public int getHealth() {
    return health;
  }

  /**
   * @param health
   *          the health to set
   */
  public void setHealth(int health) {
    this.health = health;
  }

  /**
   * @return the healthMax
   */
  public int getHealthMax() {
    return healthMax;
  }

  /**
   * @param healthMax
   *          the healthMax to set
   */
  public void setHealthMax(int healthMax) {
    this.healthMax = healthMax;
  }

  /**
   * @return the hireCost
   */
  public int getHireCost() {
    return hireCost;
  }

  /**
   * @param hireCost
   *          the hireCost to set
   */
  public void setHireCost(int hireCost) {
    this.hireCost = hireCost;
  }

  /**
   * @return the impBarrCost
   */
  public int getImpBarrCost() {
    return impBarrCost;
  }

  /**
   * @param impBarrCost
   *          the impBarrCost to set
   */
  public void setImpBarrCost(int impBarrCost) {
    this.impBarrCost = impBarrCost;
  }

  /**
   * @return the impProgCost
   */
  public int getImpProgCost() {
    return impProgCost;
  }

  /**
   * @param impProgCost
   *          the impProgCost to set
   */
  public void setImpProgCost(int impProgCost) {
    this.impProgCost = impProgCost;
  }

  /**
   * @return the money
   */
  public int getMoney() {
    return money;
  }

  /**
   * @param money
   *          the money to set
   */
  public void setMoney(int money) {
    this.money = money;
  }

  /**
   * @return the protesters
   */
  public int getProtesters() {
    return protestors;
  }

  /**
   * @param protestors
   *          the protesters to set
   */
  public void setProtesters(int protestors) {
    this.protestors = protestors;
  }

  /**
   * @return the quality
   */
  public int getQuality() {
    return quality;
  }

  /**
   * @param quality
   *          the quality to set
   */
  public void setQuality(int quality) {
    this.quality = quality;
  }
}
