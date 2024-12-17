//package lesson_4_4_9;
//
//import java.util.Objects;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//class MainTest1 {
//
//    public static final String AUSTIN_POWERS = "Austin Powers";
//    public static final String WEAPONS = "weapons";
//    public static final String BANNED_SUBSTANCE = "banned substance";
//
//    //МОЙ КОД
//    static public class IllegalPackageException extends RuntimeException {
//    }
//
//    static public class StolenPackageException extends RuntimeException {
//    }
//
//    public static class UntrustworthyMailWorker implements MailService {
//        private final MailService[] otherPersons;
//        private final RealMailService realMailService;
//
//        public UntrustworthyMailWorker(MailService[] otherPersons) {
//            this.otherPersons = otherPersons;
//            this.realMailService = new RealMailService();
//        }
//
//        public RealMailService getRealMailService() {
//            return realMailService;
//        }
//
//        @Override
//        public Sendable processMail(Sendable mail) {
//            for (MailService mailService : otherPersons) {
//                mail = mailService.processMail(mail);
//            }
//            return realMailService.processMail(mail);
//        }
//    }
//
//    public static class Thief implements MailService {
//        private final int minPrice;
//        private int stolenValue = 0;
//
//        public Thief(int minPrice) {
//            this.minPrice = minPrice;
//        }
//
//        public int getStolenValue() {
//            return stolenValue;
//        }
//
//        @Override
//        public Sendable processMail(Sendable mail) {
//            if (mail instanceof MailPackage) {
//                MailPackage mailPackage = (MailPackage) mail;
//                Package content = mailPackage.getContent();
//                if (content.getPrice() >= minPrice) {
//                    stolenValue += content.getPrice();
//                    Package stonePackage = new Package("stones instead of gold", 0);
////                    return new MailPackage(mailPackage.getFrom(),
////                            mailPackage.getTo(), stonePackage);
//                    MailPackage newMail = new MailPackage(mailPackage.getFrom(),
//                            mailPackage.getTo(),
//                            stonePackage);
//                    System.out.println("Thief replaced package: " + content.getContent() + " -> " + stonePackage.getContent());
//                    return newMail;
//                }
//            }
//            return mail;
//        }
//    }
//
//    public static class Inspector implements MailService {
//        @Override
//        public Sendable processMail(Sendable mail) {
//            if (mail instanceof MailPackage) {
//                MailPackage mailPackage = (MailPackage) mail;
//                Package content = mailPackage.getContent();
//                String item = content.getContent().trim();
//
//                if (WEAPONS.equals(item) ||
//                        BANNED_SUBSTANCE.equals(item)) {
//                    throw new IllegalPackageException();
//                }
//                if (item.contains("stones")) {
//                    throw new StolenPackageException();
//                }
//            }
//            return mail;
//        }
//    }
//
//
//
//    public static class Spy implements MailService {
//        private final Logger logger;
//
//        public Spy(Logger logger) {
//            this.logger = logger;
//        }
//
//        @Override
//        public Sendable processMail(Sendable mail) {
//            if (mail instanceof MailMessage) {
//                MailMessage message = (MailMessage) mail;
//                String from = message.getFrom();
//                String to = message.getTo();
//                String mes = message.getMessage();
//                if (AUSTIN_POWERS.equals(from) || AUSTIN_POWERS.equals(to)) {
//                    logger.warning(String.format("Detected target mail correspondence: " +
//                            "from %s to %s mes %s", from, to, mes));
//                } else {
//                    logger.info(String.format("Usual correspondence: from %s to " +
//                            "%s", from, to));
//                }
//            }
//            return mail;
//        }
//    }
//
//
//
//    //КОНЕЦ МОЕГО КОДА
//
//    //ПРОВЕРОЧНЫЙ КОД,
//
//    public static void main(String[] args) {
//        Logger logger = Logger.getLogger(Main.class.getName());
//        Inspector inspector = new Inspector();
//        Spy spy = new Spy(logger);
//        Thief thief = new Thief(1000);
//        UntrustworthyMailWorker worker = new UntrustworthyMailWorker(new MailService[]{
//                thief,
//                spy,
//                inspector});
//        AbstractSendable[] correspondence = {
////                new MailMessage("Oxxxymiron", "Гнойный", " Я здесь чисто по фану, поглумиться над слабым\n" +
////                        "Ты же вылез из мамы под мой дисс на Бабана...."),
////                new MailMessage("Гнойный", "Oxxxymiron", "....Что? Так болел за Россию, что на нервах терял ганглии.\n" +
////                        "Но когда тут проходили митинги, где ты сидел? В Англии!...."),
////                new MailMessage("Жириновский", AUSTIN_POWERS, "Бери пацанов, и несите меня к воде."),
////                new MailMessage(AUSTIN_POWERS, "Пацаны", "Го, потаскаем Вольфовича как Клеопатру"),
//                new MailPackage("берег", "море", new Package("ВВЖ", 10000)),
////                new MailMessage("NASA", AUSTIN_POWERS, "Найди в России ракетные двигатели и лунные stones"),
////                new MailPackage(AUSTIN_POWERS, "NASA", new Package(" weapons ", 2500000)),
////                new MailPackage(AUSTIN_POWERS, "NASA", new Package("stones ", 1000)),
////                new MailPackage("Китай", "КНДР", new Package("banned substance ", 10000)),
////                new MailPackage(AUSTIN_POWERS, "Жопа запрещенная группировка", new Package("tiny bomb", 9000)),
////                new MailMessage(AUSTIN_POWERS, "Психиатр", "Помогите"),
//        };
//
//        for (AbstractSendable p : correspondence) {
//            try {
//                print("До:  ", p);
//                Sendable sendable = worker.processMail(p);
//                print("После:  ", sendable);
//            } catch (StolenPackageException | IllegalPackageException e) {
//                logger.log(Level.WARNING, "из: " + p.getFrom() + " куда: " + p.getTo() + " Содержимое: "
//                        + (p instanceof MailMessage ? ((MailMessage) p).getMessage() : ((MailPackage) p).getContent().getContent()
//                        + " Цена=" + ((MailPackage) p).getContent().getPrice()) + " Exceptions: " + e);
//            }
//        }
//    }
//
//    public static void print(String prefix, Sendable p) {
//        System.out.println(prefix + "из: " + p.getFrom() + " куда: " + p.getTo() + " Содержимое: "
//                + (p instanceof MailMessage ? ((MailMessage) p).getMessage() : ((MailPackage) p).getContent().getContent()
//                + " Цена=" + ((MailPackage) p).getContent().getPrice()));
//    }
//
//    /*
//        Интерфейс: сущность, которую можно отправить по почте.
//        У такой сущности можно получить от кого и кому направляется письмо.
//    */
//    public static interface Sendable {
//        String getFrom();
//
//        String getTo();
//    }
//
//    /*
//       Абстрактный класс, который позволяет абстрагировать логику хранения
//       источника и получателя письма в соответствующих полях класса.
//    */
//    public static abstract class AbstractSendable implements Sendable {
//        protected final String from;
//        protected final String to;
//
//        public AbstractSendable(String from, String to) {
//            this.from = from;
//            this.to = to;
//        }
//
//        @Override
//        public String getFrom() {
//            return from;
//        }
//
//        @Override
//        public String getTo() {
//            return to;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            AbstractSendable that = (AbstractSendable) o;
//            if (!from.equals(that.from)) return false;
//            if (!to.equals(that.to)) return false;
//            return true;
//        }
//    }
//
//    /*
//    Письмо, у которого есть текст, который можно получить с помощью метода `getMessage`
//    */
//    public static class MailMessage extends AbstractSendable {
//        private final String message;
//
//        public MailMessage(String from, String to, String message) {
//            super(from, to);
//            this.message = message;
//        }
//
//        public String getMessage() {
//            return message;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            if (!super.equals(o)) return false;
//            MailMessage that = (MailMessage) o;
//            if (message != null ? !message.equals(that.message) : that.message != null) return false;
//            return true;
//        }
//    }
//
//    /*
//    Посылка, содержимое которой можно получить с помощью метода `getContent`
//    */
//    public static class MailPackage extends AbstractSendable {
//        private final Package content;
//
//        public MailPackage(String from, String to, Package content) {
//            super(from, to);
//            this.content = content;
//        }
//
//        public Package getContent() {
//            return content;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            if (!super.equals(o)) return false;
//            MailPackage that = (MailPackage) o;
//            if (!content.equals(that.content)) return false;
//            return true;
//        }
//    }
//
//    /*
//    Класс, который задает посылку. У посылки есть текстовое описание содержимого и целочисленная ценность.
//    */
//    public static class Package {
//        private final String content;
//        private final int price;
//
//        public Package(String content, int price) {
//            this.content = content;
//            this.price = price;
//        }
//
//        public String getContent() {
//            return content;
//        }
//
//        public int getPrice() {
//            return price;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//
//            Package aPackage = (Package) o;
//
//            if (price != aPackage.price) return false;
//            if (!content.equals(aPackage.content)) return false;
//
//            return true;
//        }
//    }
//
//    /*
//    Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
//    */
//    public static interface MailService {
//        Sendable processMail(Sendable mail);
//    }
//
//    /*
//    Класс, в котором скрыта логика настоящей почты
//    */
//    public static class RealMailService implements MailService {
//
//        @Override
//        public Sendable processMail(Sendable mail) {
//            // Здесь описан код настоящей системы отправки почты.
//            return mail;
//        }
//    }
//}
