package com.p.service.restresource;

import java.net.HttpURLConnection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.p.service.pojo.Topic;

/**
 * The Class CoachingActionResource.
 */
@Path("topics")
public class TopicResource {

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(TopicResource.class
			.getName());

	/**
	 * Gets the coaching listfor account id.
	 *
	 * @param accId
	 *            the acc id
	 * @return the coaching listfor account id
	 */

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	// @Consumes(MediaType.APPLICATION_JSON)
	public Response getCoachingListforAccountID(
	/*
	 * @PathParam("accountId") int accId,
	 */@QueryParam("item") String item, @QueryParam("Status") String Status,
			@QueryParam("actionsFor") String actionFor) {

		logger.info("Entered into getCoachingList method");

		System.out.println("item" + item + "Status" + Status + "actionFor"
				+ actionFor);

		// return
		// CoachingActionService.getInstance().getCoachingListforAccountID(accId,item,Status,actionFor);
		String message = "successfully contacted the restful API server";
		return Response.status(HttpURLConnection.HTTP_OK).entity(message)
				.build();
	}

	@POST
	@Path("/new")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(Topic person) {

		logger.info("Entered into getCoachingList method");

		System.out.println("person.getTitle() == " + person.getTitle()
				+ "\tperson.getDescription() == " + person.getDescription());

		// return
		// CoachingActionService.getInstance().getCoachingListforAccountID(accId,item,Status,actionFor);
		String message = "successfully contacted the restful API server";
		return Response.status(HttpURLConnection.HTTP_OK).entity(person)
				.build();
	}

	

}
