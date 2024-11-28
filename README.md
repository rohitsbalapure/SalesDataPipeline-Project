# SalesDataPipeline Project

This project provides an automated data pipeline to manage and process sales transaction data. The pipeline extracts data from a MySQL database, cleans and transforms it, and then loads it into Amazon Redshift for further analysis. It helps businesses make data-driven decisions through real-time analytics and business intelligence.

## Table of Contents

- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Features](#features)
- [Installation Guide](#installation-guide)
- [Usage](#usage)
- [Data Flow](#data-flow)
- [Contributing](#contributing)
- [License](#license)

## Project Overview

This project automates the extraction, transformation, and loading (ETL) of sales transaction data. Here's the step-by-step flow:

1. **Extracts** sales data from an RDS MySQL database.
2. **Stores** the raw data in Amazon S3 for backup and further processing.
3. **Transforms** the data (cleans and processes it) using a custom ETL process.
4. **Loads** the transformed data into Amazon Redshift for analytics and reporting.
5. Provides **business intelligence** with insights visualized using Power BI.

## Technologies Used

- **Java**: Backend logic for processing and managing the data pipeline.
- **Maven**: Dependency management and build tool for the project.
- **MySQL**: Stores the raw sales transaction data.
- **Amazon S3**: Storage for raw and processed data.
- **Amazon Redshift**: Cloud data warehouse for storing and analyzing the data.
- **AWS Lambda**: Serverless computing to process data (optional based on your pipeline).
- **AWS Glue**: Managed ETL service to clean and transform the data.
- **Power BI**: Tool for visualizing the data and creating business intelligence reports.

## Features

- Automated **ETL** process for daily sales data extraction, transformation, and loading.
- **Scalable** architecture using AWS services.
- **Data quality** checks such as handling missing values and duplicates.
- Real-time **business intelligence** insights via Power BI dashboards.

## Installation Guide

### Prerequisites

To run the project, you need the following tools and services:

- **Java 17+** (Make sure Java is installed on your system)
- **Maven** (For managing project dependencies)
- **AWS CLI** (With proper AWS credentials configured)
- Access to **MySQL** and **Amazon Redshift**
- **Power BI** (For visualizing the data and creating dashboards)

### Clone the Repository

Clone the repository to your local machine:

```bash
git clone https://github.com/rohitsbalapure/SalesDataPipeline-Project.git
cd SalesDataPipeline-Project
