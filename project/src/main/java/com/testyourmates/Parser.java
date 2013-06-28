package com.testyourmates;

import java.util.List;

public interface Parser {

    /**
     * Parse given string and return fields as list in order.
     *
     * @param data a log row
     * @return [    timestamp,
     *              call_name,
     *              amount,
     *              billing_address_email,
     *              storeid,
     *              ss_no (if exists)
     *         ]
     */
    List<String> parse(String data);
}
