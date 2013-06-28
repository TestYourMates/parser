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
     *              delivery_address_email (if exists otherwise null),
     *              storeid,
     *              ss_no (if exists otherwise null)
     *         ]
     */
    List<String> parse(String data);
}
