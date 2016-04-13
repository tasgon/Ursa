package org.tasgoon.ursa.data

import java.sql.Statement
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

class Database @throws[SQLException]
(val loc: String) {
    connection = DriverManager.getConnection("jdbc:sqlite:" + loc)
    statement = connection.createStatement
    initTable

    private var connection: Connection = null
    private var statement: Statement = null

    @throws[SQLException]
    private def initTable {
        statement.executeUpdate("CREATE TABLE Profiles" + "(Name varchar(255) UNIQUE, Type int, Data varchar(255)) IF NOT EXISTS Profiles")
    }

    def verifyProfile(profile: Profile): Boolean = {
        return true
    }
}