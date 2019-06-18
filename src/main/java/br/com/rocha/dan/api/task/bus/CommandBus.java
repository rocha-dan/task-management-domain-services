package br.com.rocha.dan.api.task.bus;

import org.springframework.stereotype.Service;

@Service
public class CommandBus {
//
//    private static final Logger LOGGER = ESAPI.getLogger(CartsController.class);
//
//    @Autowired
//    private CreateShoppingCartHandler createShoppingCartHandler;
//
//    @Autowired
//    private PutShoppingCartHandler putShoppingCartHandler;
//
//    @Autowired
//    private AddItemHandler addItemHandler;
//
//    @Autowired
//    private UpdateItemHandler updateItemHandler;
//
//    @Autowired
//    private DeleteItemHandler deleteItemHandler;
//
//    @Autowired
//    private ValidateShoppingCartHandler validateShoppingCartHandler;
//
//    @Autowired
//    private RetrieveShoppingCartHandler retrieveShoppingCartHandler;
//
//    @Autowired
//    private CreateThirdPartyShoppingCartHandler createThirdPartyShoppingCartHandler;
//
//    @Autowired
//    private PutThirdPartyShoppingCartHandler putThirdPartyShoppingCartHandler;
//
//    @Autowired
//    private ThirdPartyValidateShoppingCartHandler thirdPartyValidateShoppingCartHandler;
//
//    public void exec(Command command) {
//        String commandName = command.getClass().getSimpleName();
//
//        switch (commandName) {
//            case "CreateShoppingCartCommand":
//                LOGGER.info(Logger.EVENT_UNSPECIFIED, "Start handle CreateShoppingCartCommand");
//                createShoppingCartHandler.handle((CreateShoppingCartCommand) command);
//                LOGGER.info(Logger.EVENT_UNSPECIFIED, "Finish handle CreateShoppingCartCommand");
//                break;
//
//            case "PutShoppingCartCommand":
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Start handle PutShoppingCartCommand");
//                putShoppingCartHandler.handle((PutShoppingCartCommand) command);
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Finish handle PutShoppingCartCommand");
//                break;
//
//            case "AddItemCommand":
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Start handle AddItemCommand");
//                addItemHandler.handle((AddItemCommand) command);
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Finish handle AddItemCommand");
//                break;
//
//            case "UpdateItemCommand":
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Start handle UpdateItemCommand");
//                updateItemHandler.handle((UpdateItemCommand) command);
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Finish handle UpdateItemCommand");
//                break;
//
//            case "DeleteItemCommand":
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Start handle DeleteItemCommand");
//                deleteItemHandler.handle((DeleteItemCommand) command);
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Finish handle DeleteItemCommand");
//                break;
//
//            case "ValidateShoppingCartCommand":
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Start handle ValidateShoppingCartCommand");
//                validateShoppingCartHandler.handle((ValidateShoppingCartCommand) command);
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Finish handle ValidateShoppingCartCommand");
//                break;
//
//            case "RetrieveShoppingCartCommand":
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Start handle RetrieveShoppingCartCommand");
//                retrieveShoppingCartHandler.handle((RetrieveShoppingCartCommand) command);
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Finish handle RetrieveShoppingCartCommand");
//                break;
//
//            case "CreateThirdPartyShoppingCartCommand":
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Start handle CreateThirdPartyShoppingCartCommand");
//                createThirdPartyShoppingCartHandler.handle((CreateThirdPartyShoppingCartCommand) command);
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Finish handle CreateThirdPartyShoppingCartCommand");
//                break;
//
//            case "PutThirdPartyShoppingCartCommand":
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Start handle PutThirdPartyShoppingCartCommand");
//                putThirdPartyShoppingCartHandler.handle((PutThirdPartyShoppingCartCommand) command);
//                LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Finish handle PutThirdPartyShoppingCartCommand");
//                break;
//
//            case "ThirdPartyValidateShoppingCartCommand":
//            	LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Start handle ThirdPartyValidateShoppingCartCommand");
//            	thirdPartyValidateShoppingCartHandler.handle((ThirdPartyValidateShoppingCartCommand) command);
//            	LOGGER.debug(Logger.EVENT_UNSPECIFIED, "Finish handle ThirdPartyValidateShoppingCartCommand");
//            	break;
//
//            default:
//                throw new NotImplementedException("Command class " + commandName + " is not implemented");
//        }
//    }
//

}
