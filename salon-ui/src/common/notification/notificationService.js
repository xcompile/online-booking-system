import { Subject } from "rxjs";

const subject =  new Subject();

export const notificationService = {
    sendMessage: (severance, detail) => {
        subject.next({severance: severance, detail:detail});
    },
    clearMessages: () => subject.next(),
    getMessages: () => subject.asObservable()
};