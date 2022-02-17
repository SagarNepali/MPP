package prob1.bugreporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

import java.util.logging.Logger;


import prob1.classfinder.ClassFinder;

/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "prob1.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";


	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		
		//sample code for reading annotations -- you will need to change
		//this quite a bit to solve the problem
		//Sample code below obtains a list of names of developers assigned to bugs
		List<Bug> bugs = new ArrayList<>();
		HashMap<String, List<Bug>> bugReport = new HashMap<>();
		for(Class<?> cl : classes) {
			if(cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport)cl.getAnnotation(BugReport.class);

				String assignedTo = annotation.assignedTo();
				Bug bug = new Bug(annotation.severity(),annotation.description(), annotation.reportedBy(), cl.getName());
//				bugs.add(bug);
				if(bugReport.containsKey(assignedTo)){
					bugReport.get(assignedTo).add(bug);

				}else{
					bugReport.put(assignedTo,bugs);
				}
			}
		}
		String reportStr  = getReport(bugReport);
		writeToFile(reportStr);

	}

	private void writeToFile(String reportStr) {
		String path = "./src/"+PACKAGE_TO_SCAN.replace(".", "/") +"/";
		try(PrintWriter myWriter = new PrintWriter(new FileWriter(path+ REPORT_NAME))) {
			myWriter.print(reportStr);
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	private String getReport(HashMap<String,List<Bug>> map){
		StringBuilder str = new StringBuilder();

		Iterator iterator =map.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry mapElement
					= (Map.Entry)iterator.next();
			str.append(mapElement.getKey());
			List<Bug> bugList = (List<Bug>) mapElement.getValue();
			bugList.stream().forEach(x -> {
				str.append("\n\t severity: "+x.getSeverity());
				str.append("\n\t className: "+x.getClassName());
				str.append("\n\t description: "+x.getDescription());
				str.append("\n\t reportedBy: "+x.getReportedBy());
				str.append("\n");
			});
		}
		return str.toString();
	}
}
