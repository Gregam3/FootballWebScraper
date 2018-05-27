package com.bu.webscraping.scrapers;

/**
 * @author Greg Mitten (i7676925)
 * gregoryamitten@gmail.com
 */
public class LFCRedsScraper extends AbstractScraper {
    public LFCRedsScraper() {
        this.pagePathVariableIncrement = 40;
        this.pagePathVariableStart = 0;

        setPostPattern("title=\"View the profile of ([\\S\\s]*?)\"[\\S\\s]*?</a>: ([A-Z][a-z]{2} [0-9]+, [0-9]{4} [0-9]{2}:[0-9]{2}:[0-9]{2} [am|pm]+)[\\S\\s]*?<div class=\"post\">([\\S\\s]*?)<div class=\"moderatorbar");
        setPageUrlPrefix(".");
        setLastPagePatternLong("([0-9]+)</a> &nbsp;[\\S\\s]*?<a href=\"#lastPost\" class=\"navPages gouptotop\" style=\"text-decoration: none;\"><strong>Go</strong> <i class=\"fa fa-arrow-circle-down\"></i></a>");

        setPostGroupIndexes(new int[]{3, 1, 2});

        setForumSizePattern("<td class=\"stats windowbg\"> <p>([0-9,]+) Posts <br> [0-9,]+ Topics </p> </td>");
    }
}
