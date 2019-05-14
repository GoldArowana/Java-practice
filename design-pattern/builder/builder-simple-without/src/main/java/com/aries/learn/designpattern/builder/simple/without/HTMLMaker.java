package com.aries.learn.designpattern.builder.simple.without;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HTMLMaker {
    private String title;
    private String paragraph;
    private String[] items;

    public String make() {
        String lis = "";
        for (int i = 0; i < items.length; i++) {
            lis += "<li>" + items[i] + "</li>\n";
        }

        return "<html>\n<head>\n<title>"
                + title + "</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p>" + paragraph + "</p>\n" +
                "<ul>\n" + lis + "</ul>\n" +
                "</body>\n</html>";
    }


}
