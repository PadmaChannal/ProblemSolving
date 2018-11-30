/*
This is just a simple shared plaintext pad, with no execution capabilities.

When you know what language you'd like to use for your interview,
simply choose it from the dropdown in the top bar.

You can also change the default language your pads are created with
in your account settings: https://coderpad.io/settings

Enjoy your interview!

"bar louie"
"pizzeria delta"
"the rat bar"

type in "ba"
"bar louie"
"the rat bar"
*/

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
/*
Part 1
Given a list of bookmark objects and a search term, return 
bookmarks where the search term is a prefix of one of the words 
in the business name. Return the top 4 business results by 
relevance (best match) to business name. For example searching 
for 'ba' in these bookmark objects should suggest 'bat' and 
'rat bar'.
*/
  public static void main(String[] args) { 
    
    
    String bizName1[] = {
      "bar",
      "rat",
      "hat",
      "rat xxr"
    };


    String bizName2[] = {
      "Burger Place",
      "Super Duper Burger",
      "Aburde fake name"
    };

    /*
    for (String string : bizName1) {
      System.out.println(string);
    }
    */
    
    
    B-> U ->R-> G ->E-> R[burger Place]
      
      sart
          B 
            U 
              R
      
      O(lenth biz name)
             
    
    /*
      start
      /    \
     a      b
            |
            a
          / |
         t  r
            ^
            [bar, bar basic...]
    */
    
    
    System.out.println("Results are" + getBusinessByTarget(bizName1,"ba "));
  }
  
  public static ArrayList<String> getBusinessByTarget(String[] businesses, String target){
    
    ArrayList<String> results = new ArrayList<String>();
    
    if(businesses == null || businesses.length == 0 || target == null || target.equals(""))
      return results;
    
    for(String biz : businesses){
      String[] words = biz.split(" ");
      for(String word : words){
        if(word.startsWith(target)){
          results.add(biz);
          break;
        }
      }
    }
    
    return results;
        
}
  
}


