import { Experience } from './Experience';
import { Education } from './Education';
export class YearUpStudent{
    id: number;
    accountId: number;
    firstName: string;
    lastName: string;
    nickName: string;
    email: string;
    phoneNumber: string;
    bio: string;
    skill: string;
    expeience: Experience[];
    education: Education[];
}