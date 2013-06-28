package com.testyourmates;

import junit.framework.TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Unit test for Parser.
 */
public class ParserTest extends TestCase
{
    private Parser parser;
    private ArrayList<String> entries;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        parser = new ParserImpl();
        entries = getEntriesFromFile();
    }

    private ArrayList<String> getEntriesFromFile() throws FileNotFoundException {
        ArrayList<String> entries = new ArrayList<String>();
        Scanner scanner = new Scanner(new FileInputStream("resources/input.log"));
        try {
            while (scanner.hasNextLine()){
                entries.add(scanner.nextLine());
            }
        }
        finally{
            scanner.close();
        }
        return entries;
    }
}
