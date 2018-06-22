package com.bu.webscraping.scrapers;

/**
 * @author Greg Mitten (i7676925)
 * gregoryamitten@gmail.com
 */
public class GrandOldTeamScraper extends AbstractScraper {
    public GrandOldTeamScraper() {
        setPostPattern("data-lb-caption-desc=\"([\\S\\s]*?)·([\\S\\s]*?)\">" +
                "[\\S\\s]*?<div class=\"bbWrapper\">([\\S\\s]*?)<div class=\"js-selectToQuoteEnd\">");
        setPageUrlPrefix("/page-");
        setPostGroupIndexes(new int[]{3, 1, 2});

        setLastPagePatternLong("js-pageJumpPage\" value=\"[0-9]+\" min=\"[0-9]+\" max=\"([0-9]+)\" step=\"[0-9]+\"");

        setForumSizePattern("Messages[\\S\\s]*?</dt>[\\S\\s]*?<dd>[\\S\\s]*?([0-9,]+)");

        setQuotePattern("<div class=\"bbCodeBlock-expandContent\">([\\S\\s]*?)<div class=\"bbCodeBlock-expandLink\">" +
                "[\\S\\s]*?</a>([\\S\\s]*)");
    }
}
