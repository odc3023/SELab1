# SELab1

Project Overview

This project is a part of Lab 1 for the HIT Software Engineering course. The objective is to create and analyze a directed graph based on a given text file, implementing various functionalities such as querying bridge words, generating new text with bridge words, calculating the shortest path between two words, and performing a random walk.

Features: Build Directed Graph:Parses a text file to create a directed graph with weighted edges. Query Bridge Words:Finds and returns bridge words between two given words in the graph. Generate New Text:Generates new text by inserting bridge words between pairs of words in a given input text. Calculate Shortest Path:Calculates and returns the shortest path between two given words in the graph. Random Walk:Performs a random walk through the graph, starting from a random node.

Installation and setup: git clone https://github.com/odc3023/SELab1.git cd SELab1 mvn clean install You can run the main application using: mvn exec:java -Dexec.mainClass="com.example.DirectedGraph"

License This project is licensed under the MIT License - see the LICENSE.md file for details.

Acknowledgments: JGraphT Library JGraphX Library JUnit
