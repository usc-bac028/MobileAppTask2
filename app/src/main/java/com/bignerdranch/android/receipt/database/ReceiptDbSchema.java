package com.bignerdranch.android.receipt.database;

public class ReceiptDbSchema {
    public static final class ReceiptTable {
        public static final String NAME = "receipts";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
        }
    }
}