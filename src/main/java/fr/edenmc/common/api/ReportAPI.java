package fr.edenmc.common.api;

import fr.edenmc.common.cache.data.Report;

import java.util.Queue;

public interface ReportAPI {
    void addReport(Report report);

    void updateReport(Report report);

    Queue<Report> getReports();
}
