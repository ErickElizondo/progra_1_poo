import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot{
    @Override
    public void onUpdateReceived(Update update){
        System.out.println(update.getMessage().getFrom().getFirstName()+": "+update.getMessage()
        .getText());
        
        SendMessage sendMessage=new SendMessage().setChatId(update.getMessage().getChatId());
        sendMessage.setText("Hello "+update.getMessage().getFrom().getFirstName()+"\n"+update.getMessage().getText());
        
        try {
            sendMessage(sendMessage);
        }
        catch(TelegramApiException e){
            e.printStackTrace();
        }        
    }
    
    @Override
    public String getBotUsername(){
        return "Prograpoo1bot";
    }
    
    @Override
    public String getBotToken(){
        return "689327470:AAFkoSKw1NF5ZDHrwbpETfC3D3FWdHIdXYw";
    }    
}
